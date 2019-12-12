![banner](art/spaceX.png)
# SpaceX :rocket:

The purpose of this project is to follow up Clean Architecture principles by bringing them to Android. It is worth saying that the idea is to take advantage of the Kotlin Programming Language features plus also pull in lessons learned and ideas from other interesting aproaches like Functional Programming,
 MVVM setup, LiveData and Rxjava.

![structure](art/clean_architecture.png)

## Testing

### Unit Testing

There are some highlights:
* Every layer in the architecture has been tested with its mapper|transformer|provider.
* Mockito has been used for mocking and stubbing.
* Given|When|Then steps have been followed, in order to give a more structured overview.

### UI Testing

Following the same approach I made in a previous personal project, a month ago [Medium Post][post], I've used a dynamic test configuration.
* In order to mock the responses and use them for instrumentation testing, I've used MockWebServer.
* In order to give a concise and clean face of the Espresso tests, I've applied [Robot Pattern][jake].

[post]:  https://medium.com/@f.prieto.moyano/mockwebserver-dagger2-with-style-b5367698ce13
[jake]:  https://academy.realm.io/posts/kau-jake-wharton-testing-robots/

![robot](art/robot_pattern.png)


## Libraries Used

* [Rx][0] for reactive style programming (from VM to Data).
* [LiveData][1] for reactive style programming (from VM to UI). 
* [Navigation][2] for in-app navigation. 
* [Rx][3] for cache storage.
* [Dagger2][4] for dependency injection.
* [Retrofit][5] for REST api communication.  
* [Timber][6] for logging.
* [Espresso][7] for UI tests.
* [Mockito-Kotlin][8] for mocking in tests.
* [MockWebServer][9] for Instrumentation tests.
* [AndroidX Test Library][10] for providing JUnit4 and functions as `launchActivity` in UI tests
* [Picasso][11] Image downloading and caching library

[0]:  https://github.com/ReactiveX/RxAndroid
[1]:  https://developer.android.com/topic/libraries/architecture/livedata
[2]:  https://developer.android.com/topic/libraries/architecture/navigation/
[3]:  https://github.com/ReactiveX/RxAndroid
[4]:  https://github.com/google/dagger
[5]:  https://github.com/square/retrofit
[6]:  https://github.com/JakeWharton/timber
[7]:  https://developer.android.com/training/testing/espresso/
[8]:  https://github.com/nhaarman/mockito-kotlin
[9]:  https://github.com/square/okhttp/tree/master/mockwebserver
[10]: https://github.com/android/android-test
[11]: https://square.github.io/picasso/

#  License

    Copyright 2019 Fernando Prieto Moyano

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.