# level
퍼킹 안드로이드 version, level, code name 햇갈려.

28. Android 9.0
27. Android 8.1
26. Android 8.0
25. Android 7.1
24. Android 7.0 N Nougat
23. Android 6.0 M Marshmallow - 사용자는 앱이 설치될 때가 아니라 앱이 실행되는 중에 앱에 권한을 부여합니다
activity?.shouldShowRequestPermissionRationale(permision)!!

22. Android 5.1 LOLLIPOP_MR1
21. Android 5.0 LOLLIPOP - sd card access available.
20. Android 4.4W KITKAT_WATCH
19. Android 4.4 KITKAT - Storage Access Framework(SAF)
18. Android 4.3 JELLY_BEAN_MR2 - kakao bank
00. ignore




# Permision

android 6.0 - targetSdkVersion 23
https://developer.android.com/training/permissions/requesting?hl=ko

https://developer.android.com/about/dashboards/?hl=ko

int checkSelfPermission (Context context, String permission)
PERMISSION_GRANTED: 퍼미션이 부여된 상태
PERMISSION_DENIED: 펴미션이 부여되지 않은 상태

https://developer.android.com/training/permissions/requesting

ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},200 );
 void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)


https://www.bsidesoft.com/?p=6824

android.permision.*
android.permision-group.*


* https://inthecheesefactory.com/blog/things-you-need-to-know-about-android-m-permission-developer-edition/en
* https://github.com/permissions-dispatcher/PermissionsDispatcher
