import UIKit
import Flutter
import Firebase
import FirebaseCore
import FirebaseFirestore
import FirebaseAuth
import Branch

@UIApplicationMain
@objc class AppDelegate: FlutterAppDelegate {
  override func application(
    _ application: UIApplication,
    didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
  ) -> Bool {
    FirebaseApp.configure()
    GeneratedPluginRegistrant.register(with: self)
//     Branch.setUseTestBranchKey(true)
    return super.application(application, didFinishLaunchingWithOptions: launchOptions)
  }
}
