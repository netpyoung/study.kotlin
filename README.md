* kotlin
2017 official suppport
* https://kotlinlang.org/docs/reference/idioms.html

* test?
 - quickcheck
 - system
* fmt
 - https://ktlint.github.io/





https://github.com/junsuk5/kotlin-android

ART(Android RunTime)

https://source.android.com/devices/tech/dalvik

.java -> .class -> JVM
.java -> .class -> .dex -> ART


Activity: UI를 구성
Fragment: 프래그먼트는 자체 수명 주기를 가지고, 자체 입력 이벤트를 받으며, 액티비티 실행 중에 추가 및 제거가 가능한 액티비티의 모듈식 섹션이라고 생각하면 됩니다
Android가 프래그먼트를 처음 도입한 것은 Android 3.0(API 레벨 11)부터입니다
 - BackStack

Service: UI 없이 백그라운드
 - startService
 - bindService
 - AIDL(Android Interface Definition Language)
ContentProvider: 애플리케이션 간 데이터를 공유
BroadcastReceiver: 이벤트 모델로 수행


# lifecycle
https://stackoverflow.com/questions/7496844/fragment-lifecycle-with-respect-to-its-activity


Activity
Fragment

# Gradle
build process
https://developer.android.com/studio/build/?hl=ko

# gradle-dsl-kotlin
https://proandroiddev.com/migrating-android-app-to-gradle-kotlin-dsl-1-0-c903760275a5


https://github.com/gradle/kotlin-dsl
https://blog.gradle.org/kotlin-meets-gradle

# AndroidManifest.xml
# layout.xml


# Actor Model - akka
https://www.linkedin.com/pulse/kotlin-akka-typed-pawel-wlodarski


# # swift?
https://github.com/josete89/swifttor

# protobuf- kotlin - swift
# interface generator
# db genreator

# compatible
dpi

# values-ko-rKR ???
sqlite or realm?


# storage
File file1 = new File(Environment.getExternalStoragePublicDirectory( Environment.DIRECTORY_PICTURES), "a.jpg");

# ShraedPreference
https://developer.android.com/reference/android/content/SharedPreferences


# ref
* 깡샘의 코틀린 프로그래밍
  - https://www.youtube.com/watch?v=zMh9JkHcf3M&list=PLdc5qO8vHAtb_F-7UN3flmow7kyvYmMtR
  - https://github.com/kkangseongyun/kkangs_kotlin



# intent : component <-> component
`<intent-filter>` 암시적 인텐트
<category android:name="android.intent.category.DEFAULT"/>

명시적인텐트
string based to class based
https://developer.android.com/reference/android/os/Parcelable

# contentProvider : App <-> App
`<provider></provider>`

# View
AdapterView 항목나열 Adapter class 필요.

ActionBar 테스트바
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
Menu
MenuItem
MenuInflater
MenuBuilder
ActionView
SearchView

SpannableString

Spinner : 콤보박스

SeekBar, ProgressBar

# AndroidX

# test
https://developer.android.com/topic/libraries/testing-support-library/?hl=ko#UIAutomator

AndroidJUnitRunner: Android용 JUnit 4 호환 테스트 실행기
Espresso: 앱 내부에서 기능적 UI 테스트를 실행하기에 적합한 UI 테스트 프레임워크
UI Automator: 시스템과 설치되어 있는 앱 전반에 걸쳐 앱 간의 기능적 UI 테스트를 실행하기에 적합한 UI 테스트 프레임워크

===


An in-depth look at Kotlin’s initializers
https://medium.com/keepsafe-engineering/an-in-depth-look-at-kotlins-initializers-a0420fcbf546

Child secondary constructor default argument
Child primary constructor default argument
Parent primary constructor default argument
Parent.a
Parent.init
Parent.b
Parent primary constructor
Child.a
Child.init 1
Child.b
Child.init 2
Child primary constructor
Child secondary constructor




`this` `field`

SAM(single Abstract Method)
`it`

fun Int.isEven() = this % 2 = = 0

companion object { }


[안드로이드] Fragment BackStack에 대한 고찰.출처: http://soulduse.tistory.com/23 [프로그래밍좀비]



# gradle
https://gradle.org/install/

Scoop install gradle
Brew install gradle


Kotlin - DSL
```
gradle init --dsl kotlin
```

Kotlin Android Extensions, Anko

한국: https://www.inflearn.com/course/%EC%BD%94%ED%8B%80%EB%A6%B0-%EA%B0%95%EC%A2%8C-%EC%83%88%EC%B0%A8%EC%9B%90/

https://guides.gradle.org/migrating-build-logic-from-groovy-to-kotlin/

https://docs.gradle.org/current/userguide/build_init_plugin.html

https://github.com/gradle/kotlin-dsl


dependencies
https://docs.gradle.org/5.0/userguide/kotlin_dsl.html
https://docs.gradle.org/5.0/userguide/java_library_plugin.html#java_library_plugin
Api / implementation / testImplementation



https://blog.gradle.org/gradle-kotlin-dsl-release-candidate

https://expertise.jetruby.com/how-to-write-gradle-scripts-with-kotlin-dsl-better-than-groovy-a63ffc9be2e3

https://medium.com/@napperley/gradle-kotlin-dsl-tutorial-223370af9cd8

Gradle Goes Kotlin by Hans Dockter
https://www.youtube.com/watch?v=4gmanjWNZ8E



Android Architecture Blueprints
https://github.com/googlesamples/android-architecture

https://thdev.net/754?category=435517

MVC
MVP
MVVM

——————

https://github.com/skydoves/PreferenceRoom

Type-safe HTTP client for Android and Java by Square, Inc. http://square.github.io/retrofit/
https://github.com/square/retrofit

MVVM:
https://www.simform.com/mvc-mvp-mvvm-android-app-development/


Theme
https://github.com/jaredrummler/Cyanea


# 코틀린 의 apply, with, let, also, run 은 언제 사용하는가?
* https://medium.com/@limgyumin/코틀린-의-apply-with-let-also-run-은-언제-사용하는가-4a517292df29

https://www.androidhuman.com/lecture/kotlin/2016/07/06/kotlin_let_apply_run_with/

# etc
public class TextureRenderView extends TextureView implements IRenderView {


# extension
* https://kotlinlang.org/docs/reference/extensions.html

# macro
not yet on kotlin
