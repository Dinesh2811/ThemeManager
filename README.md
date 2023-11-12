# ThemeManager Library

#### Welcome to the ThemeManager library!

ThemeManager is a user-friendly Android open-source library that helps you to choose app theme as per user's choice.

## Getting Started
To integrate ThemeManager into your project, follow these simple steps:
- ##### Add the JitPack repository to your gradle (kts) file
  >
        repositories {
            ...
            maven ("https://jitpack.io")
        }
- ##### Add the dependency to your build.gradle {kts)
  >
        dependencies {
            ...
            implementation("com.github.Dinesh2811:ThemeManager:1.7")
        }
- ## Usage 1:
  >
        import com.dinesh.theme.app.ThemePreference
		import com.dinesh.theme.app.launchActivity
		
		class MainActivity : ThemePreference() {
			override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentViewLayout(R.layout.activity_main_layout)
				
				//  To navigate to an activity use 'launchActivity'
				launchActivity(NewActivity::class.java)
			}
		}
- ## Usage 2:
  >
		import com.dinesh.theme.app.ThemeManager
		
		class MainActivity : AppCompatActivity() {
			override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				ThemeManager(this).applyTheme(R.style.Theme_Dynamic_Light, R.layout.activity_main_layout)
				
				// ...
			}
		}


## Contribution
Whether you're looking to offer your expertise, suggest improvements, report issues, or ask questions, your involvement is highly valued and much appreciated. Any kind of contributions from the community are most welcomed.

#### Here's how you can contribute:

- #### Report Issues:
  If you come across any bugs, glitches, or unexpected behavior, please report them using the GitHub issue tracker. Be sure to provide detailed steps to reproduce the issue and any relevant information.

- #### Submit Pull Requests:
  Have a fix or enhancement in mind? You can submit pull requests with your proposed changes. We'll review them and work together to integrate valuable additions into the library.

- #### Share Ideas:
  Have ideas for new features or improvements? Feel free to open discussions in the GitHub repository. Your input can help shape the future of EasyPermissionRequest.


## Getting Help
If you have questions about using the library, implementing specific features, or understanding the code, don't hesitate to reach out. Use the GitHub issue tracker to ask questions or seek clarifications.

## Spread the Word
If you find ThemeManager useful, consider sharing it with fellow developers and communities. Let's make permission handling easier for everyone!

## License

Licensed under the terms of the [Apache License 2.0][7]. See [License](LICENSE) for details.

```
   Copyright 2023 Dinesh K

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

[7]: https://www.apache.org/licenses/LICENSE-2.0

# Happy coding!
