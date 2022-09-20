# RetrofitAndroidExampleMVVM

[Sankalp Parab](https://www.linkedin.com/in/sankalp-p-b130d6/)


![](https://komarev.com/ghpvc/?username=sankalpsp98) 



I used the MVVM software design pattern in this project to integrate [{JSON} Placeholder](https://jsonplaceholder.typicode.com/), a free fake API for testing and prototyping.

# Retrofit for NetworkLayer 
Retrofit is type-safe REST client for Android and Java which aims to make it easier to consume RESTful web services. We’ll not go into the details of Retrofit 1.x versions and jump onto Retrofit 2 directly which has a lot of new features and a changed internal API compared to the previous versions. Retrofit 2 by default leverages OkHttp as the networking layer and is built on top of it. Retrofit automatically serialises the JSON response using a POJO(Plain Old Java Object) which must be defined in advanced for the JSON Structure. To serialise JSON we need a converter to convert it into Gson first. We need to add the following dependencies in our build.grade file.

# Other Topics Coverd in this Repository
[lottie](https://airbnb.io/lottie/#/android)

viewmodel

coroutine

cardview

RecyclerView



# Dependencies Used
```
dependencies {
   implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.5.1'
    implementation 'com.google.android.material:material:1.6.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
   
    implementation "androidx.cardview:cardview:1.0.0" 
    
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4'
    
    //viewmodel
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0-alpha02'

    //Retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation 'androidx.recyclerview:recyclerview:1.3.0-beta02'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'


    //lottiefiles
    implementation 'com.airbnb.android:lottie:5.2.0'

   
}
```
