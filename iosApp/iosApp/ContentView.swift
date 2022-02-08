import SwiftUI
import shared
import Combine

class ObservableModel: ObservableObject {
    private var viewModel: MainViewModel?

    @Published
    var count: [Int]?

    func activate(){
        viewModel = MainViewModel { [weak self] dataState in
            self?.count = 0
        }
    }
}

struct ContentView: View {
    @ObservedObject
    var observableModel = ObservableModel()

	var body: some View {
		VStack {
		if let observableModel.count = count {
		    Text(count).font(.headline)
		}
		Button("INCREMENT", action: {
		    withAnimation { viewModel.incrementCounter() }
		})
		}
	}
}


struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView(viewModel: MainViewModel())
	}
}