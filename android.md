runOnUiThread

# BottomSheetBehavior
부모 노드는
`androidx.coordinatorlayout.widget.CoordinatorLayout`

# webview
``` kotlin

                webview_main.clearCache(true)
                webview_main.clearHistory()
                webview_main.settings.javaScriptEnabled = true
                webview_main.settings.javaScriptCanOpenWindowsAutomatically = true
```

# Android Kotlin DSL

* java
``` java
sourceSets {
  main {
    assets.srcDirs = ["src/main/assets"]
  }
}
```

* kotlin
``` kotlin
sourceSets {
	getByName("main").assets.srcDirs("src/main/assets")
}
```
