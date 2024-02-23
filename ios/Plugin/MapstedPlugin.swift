import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(MapstedPlugin)
public class MapstedPlugin: CAPPlugin {
    private let implementation = Mapsted()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }
        @objc func launchMapActivity(_ call: CAPPluginCall) {
        do {
            guard let bridge = bridge else {
                throw NSError(domain: "Mapsted", code: 500, userInfo: ["message": "Bridge not available"])
            }

            DispatchQueue.main.async {
                //print("BundlePath - \(Bundle(for: Mapsted.self))")
                let storyboard = UIStoryboard(name: "Mapsted", bundle: Bundle(for: Mapsted.self))
                if let viewController = storyboard.instantiateViewController(withIdentifier: "MAPSTEDVC") as? Mapsted {
                    viewController.modalPresentationStyle = .overCurrentContext
                    
                    //print("bridge.viewController - \(String(describing: bridge.viewController))")
                        bridge.viewController?.present(viewController, animated: true)
                    //bridge.viewController?.navigationController?.pushViewController(viewController, animated: true)
                    call.resolve()
                }
            }
        } catch {
            call.reject("An error occurred: \(error.localizedDescription)")
        }
    }
}
