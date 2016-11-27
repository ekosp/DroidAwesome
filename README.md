# ![picture alt](https://lh4.googleusercontent.com/aZYMAdUdEazOLA1YN3dJxCu3_p_KOxJBUsbPuCTPJaRj85x-dZdV0f3HIeH1jFVLKfoVcWRK=w1313-h654 "Icon") DroidAwesome
Custom Views that support FontAwesome directly

[ ![Download](https://api.bintray.com/packages/lmntrx-tech/DroidAwesome/droid-awesome/images/download.svg) ](https://bintray.com/lmntrx-tech/DroidAwesome/droid-awesome/_latestVersion) [ ![Download](https://jitpack.io/v/Livin21/DroidAwesome.svg "jitpack.io") ](https://jitpack.io/#Livin21/DroidAwesome/v1.1.0) [![StackShare](https://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/Livin21/droidawesome)

## Views Supported: ##
* TextView
* AutoComplete TextView
* EditText
* Switch
* CheckBox
* Radio Button
* Button
* Toggle Button
* ImageView
* ImageButton
* FloatingActionButton

## Screenshot ##
![Screenshot 1](https://lh4.googleusercontent.com/TN3y4ipqjTAHQJKV7Ok88uobRM1QZIthvYJqgA4BQ4g9I5DsPCMmgBE38nc8Y8SSsq5YdwUqrsztcgM=w971-h654-rw "Screenshot 1") ![Screenshot 2](https://lh5.googleusercontent.com/r12ZN1GfXaamCcgsoVKEftdSCusbF57Qh4ByeKSbvU7pd0WMPqeRi0LOj2dkUsNLjsPHNMvV=w1313-h654-rw "Screenshot 2")

## Gradle Setup ##
Add the following code snippet to module/build.gradle
```
repositories {
    maven {
        url 'https://dl.bintray.com/lmntrx-tech/DroidAwesome'
    }
}
dependencies {
    compile 'com.lmntrx.livin.library.droidawesome:droid-awesome:1.1.0'
}
```


## Maven Setup ##
```
<dependency>
  <groupId>com.lmntrx.livin.library.droidawesome</groupId>
  <artifactId>droid-awesome</artifactId>
  <version>1.1.0</version>
  <type>pom</type>
</dependency>
```

## How to use it? ##
1. Define required icons in res/values/icons.xml
```
<?xml version="1.0" encoding="utf-8"?>
  <resources>
     <string name="android_icon_font_awesome">&#xf17b;</string> //http://fontawesome.io/cheatsheet/
     <string name="not_allowed_font_awesome">&#xf05e;</string>
  </resources>
```
2. Now use custom view in activity.xml
```
<com.lmntrx.livin.library.droidawesome.DroidAwesomeAutoCompleteTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="65sp"
        android:textColor="#0f0"
        android:gravity="center"
        android:text="@string/android_icon_font_awesome"/>

<com.lmntrx.livin.library.droidawesome.DroidAwesomeImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:text="@string/not_allowed_font_awesome"
        app:textColor="@color/colorAccent"
        app:textSize="38sp"/>
```

### Tip: For smooth rendering in android studio one might have to include [font-awesome.ttf](https://github.com/Livin21/DroidAwesome/blob/master/droid-awesome/src/main/assets/fonts/font-awesome.ttf?raw=true) in assets/fonts/ ###

## ChangeLog ##

### 1.1.0 ###
* Added ImageView
* Added ImageButton
* Added FloatingActionButton

### 1.0.1 ###
* Minor Bug Fix

### 1.0.0 ###
* Added custom TextView
* Added custom AutoComplete TextView
* Added custom EditText
* Added custom Button
* Added custom ToggleButton
* Added custom Switch
* Added custom CheckBox
* Added custom Radio Button

## Copyright ##
```
Copyright 2016 DroidAwesome - Livin Mathew

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```