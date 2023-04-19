# Kustom Skin Sample #
There are a few ways to build a Kustom APK:

* *EASIEST/RECOMENDED* Build an APK through the [APKMAKER](https://play.google.com/store/apps/details?id=org.kustom.apkmaker) android app
* *ADVANCED* You can follow the tutorial below, this tutorial requires a PC (Windows / OSX or Linux)
* *ADVANCED* This skin has an integrated Dashboard but you prefer you can use more advanced ones with Kustom support like [Polar](http://afollestad.github.io/polar-dashboard/) or [IconShowcase](https://github.com/jahirfiquitiva/IconShowcase-Dashboard)

# Play store TAGs
In order to be found inside the app please use the followings keywords in Skin Title, Description or Package name (any is fine):

* Use **KLWP** for [Kustom Wallpaper](https://play.google.com/store/apps/details?id=org.kustom.wallpaper) skins
* Use **KWGT** for [Kustom Widget](https://play.google.com/store/apps/details?id=org.kustom.widget) skins
* Use **KLCK** for [Kustom Lockscreen](https://play.google.com/store/apps/details?id=org.kustom.lockscreen) skins
* Use **KWCH** for [Kustom Watch](https://play.google.com/store/apps/details?id=org.kustom.watchface) skins
* Use **Kustom Komponents** for Kustom Komponents Pack

# Create skin using Android Studio 
The project requires Java SDK 1.8 or newer (1.7 won't work) and can be imported on Android Studio 3.0 or later available from [developer.android.com](https://developer.android.com/sdk/installing/studio.html), or, as an alternative, you can also use gradle via command line but **Eclipse is not supported!**. Please do the following to have build a Skin:

* Download the full repo as a ZIP file from [here](https://gitlab.com/kustom-industries/kustom-apk-skin-sample/-/archive/master/kustom-apk-skin-sample-master.zip) and uncompress it somewhere, you can change the folder name
* Copy your Wallpapers / Widgets / Wallpapers / Komponents / Watches (as they are, without renaming or unpacking them) in `app/src/main/assets/` (inside the wallpaper/widget/komponents dir), delete the helloworld template and the README file.
* Open `app/src/main/AndroidManifest.xml` and:
    * Change `package` to something that will be unique to your app
    * Comment uncomment action names according to what your package is providing (by default it will provide Wallpapers, but you can provide just Komponents for example)
    * If you are not going to use standard image wallpapers you can comment out all the 4 permissions since those are not needed
* Open `app/build.gradle` and:
    * Change  `applicationId` to the same package name used above
    * Modify version if needed (you will need to upgrade this when releasing updates)
* Open `app/src/main/res/values/config.xml` and edit application name, skin title, description and change dashboard config if you like
* Change the icons with your ones in `app/src/main/res/mipmap-*` (you can generate the icons by using [Android Icon Generator](https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html), just load an image and download as zip)
* Import the project in Android Studio with "File -> Import Project"
* Once imported Build a signed APK using "Build -> Create Signed APK"
* Release your app (if you do not know how to do that please check the [Android Developer Site](http://developer.android.com/tools/publishing/publishing_overview.html)), to publish the app to the Play Store you will need a proper keystore.

# Standard wallpapers support
The skin pack also supports standard static walls (so not KLWP files), you might want to add them along with your widgets or in general as an addition to your pack. The walls are not stored in the APK since Kustom supports only cloud based walls, steps to add them are the following:

* Create a JSON for wallpapers following [this tutorial](https://kustom.rocks/apkmaker/walls/json)
* Open `app/src/main/res/values/config.xml` and set "kustom_dashboard_walls" to "true", then add your JSON url created in the above step to "kustom_dashboard_walls_url"
* Open `app/src/main/AndroidManifest.xml` and ensure the permissions for the wallpaper support are uncommented
* Optionally you can change the background of the image preview with "kustom_translucent_background" and "kustom_translucent_background_text" params

# More Info
For more information please visit [Kustom Support Site](http://help.kustom.rocks)
