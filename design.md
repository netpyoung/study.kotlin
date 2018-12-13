# coding guide line
https://github.com/ribot/android-guidelines/blob/master/project_and_code_guidelines.md


File encoding utf8
Editor> File Encodings
Global/ Project / Properties

Editor > General > Auto Import
Java
Add unambiguous imports on the fly
Optimize imports on the fly

kiket
android version 4.4 - - api level 19 - Storage Access Framework(SAF)

Lollipop
android version 5.0 - api level 20

android version 5.1 - api level 22 - sd card access available.



# Androidx
support library => androidx

# jetpack
* https://developer.android.com/jetpack

* Architecture
DataBinding, Room, DataModel LifeCycle, LiveData, Navigation
* Foundation
AppCompat
ktx - kotlin extension

MultiIndex
test
* Behavior
notification / permision ...
* UI
Fragment, Layout, Animation ...

# KTX
https://android.github.io/android-ktx/core-ktx/

# maven
mavenCentral
jcenter
google

## Architecture.Navigation
내비게이션 에디터


/MainActivity.kt
/ui.main/
  - ManiFragment.kt
  - MainViewModel.kt

# data binding
https://developer.android.com/topic/libraries/data-binding/start

```
android {
    ....
    dataBinding {
        enabled = true
    }
}
```


room - sqlcipher library
@Dao


@OnLifecycleEvent(value = Lifecycle.Event.ON_RESUME)






# Ref.
* https://medium.com/coupang-tech/coupang-android-architecture-part-1-10be2ce231ac

MVC
MVP
MVVM
- mvvm에는 data binding이 (거의)필수적으로 필요하게 됨.

# build optimize
http://gun0912.tistory.com/76
minSdkVersion을 21로


run app
apply changes - instant run
