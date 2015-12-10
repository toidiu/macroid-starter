macroid-starter
===============

A sample project to start playing with [Macroid](https://github.com/macroid/macroid).

* Follow [these instructions](http://macroid.github.io/ScalaOnAndroid.html) to get started with Scala on Android
* `git clone https://github.com/macroid/macroid-starter && cd macroid-starter`
* `sbt android:run`

*Macroid* documentation: http://macroid.github.io

### Scala footprint on dex:
| Lib           | Dex count     | Percent  | Available
| ------------- |:-------------:| --------:| -----:
| Total         | 65536         | 100%     |
| Scala         | 4028          | <6.2%    | 61508
| macroid       | 98            | <.15%    |61410
| Android       | 1576          | <2.41    | 59834



**Scala lib**:  **4,028** 




**macroid** another **98**
Given that the the dex limit is 65,536 thats only **6.3%** of the total. A easy compromise considering what you gain.

The built apk files are stored in [PROJECT Root]/target/android-bin/
* You can use the web tool to measure teh dex count: http://inloop.github.io/apk-method-count/
* Or execute ````./dex-method-counts target/android-bin/macroid-starter-debug.apk ````






Other links:
starter: http://macroid.github.io/ScalaOnAndroid.html
android-sdk-plugin: https://github.com/pfn/android-sdk-plugin
example proj: https://github.com/pfn/android-sdk-plugin/tree/master/sbt-test/android-sdk-plugin
akka http://spin.atomicobject.com/2013/06/20/akka-scala-on-android/
akka http://macroid.github.io/modules/Akka.html
reactive stuff: http://danosipov.com/?p=692
retro lamda and stuff: https://www.theguardian.com/info/developer-blog/2014/dec/11/functional-android

