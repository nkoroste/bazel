This is a fork of Bazel with Snapchat specific bug fixes and improvements. It's currently based on the following version:
- Remote tag: [3.4.1](https://github.com/bazelbuild/bazel/tree/3.4.1)

Making changes:
- Put up a PR against the master branch.
- Run [bazel-builder](https://snapengine-builder.sc-corp.net/jenkins/job/bazel-builder/) jenkins job against your branch to generate and deploy a bazel release to [GCS](https://console.cloud.google.com/storage/browser/snap-bazel-releases): 
  - Once the build is finished, update the `.bazelversion file` in the Android repo with the number of your build. 
  - Once your change is tested. Run `:cool:` on your PR in the bazel repo.
  
Making changes to Android tools:
- Bump the version of the tools [here](https://github.sc-corp.net/Snapchat/bazel/blob/upstream/tools/android/runtime_deps/upload_android_tools.sh#L34)
- Put up a PR against the master branch
- Run [bazel-android-tools-builder](https://snapengine-builder.sc-corp.net/jenkins/job/bazel-android-tools-builder/) jenkins job against your branch to
upload the compiled jar to [GCS](https://console.cloud.google.com/storage/browser/snap-bazel-releases).
- Once the job is finished. It will push a commit back to branch.
- Cool the PR and follow the instructions above to bump the Bazel version in the Android repo.

# [Bazel](https://bazel.build)

*{Fast, Correct} - Choose two*

Build and test software of any size, quickly and reliably.

* **Speed up your builds and tests**:
  Bazel rebuilds only what is necessary.
  With advanced local and distributed caching, optimized dependency analysis and
  parallel execution, you get fast and incremental builds.

* **One tool, multiple languages**: Build and test Java, C++, Android, iOS, Go,
  and a wide variety of other language platforms. Bazel runs on Windows, macOS,
  and Linux.

* **Scalable**: Bazel helps you scale your organization, codebase, and
  continuous integration solution. It handles codebases of any size, in multiple
  repositories or a huge monorepo.

* **Extensible to your needs**: Easily add support for new languages and
  platforms with Bazel's familiar extension language. Share and re-use language
  rules written by the growing Bazel community.

## Getting Started

  * [Install Bazel](https://docs.bazel.build/install.html)
  * [Get started with Bazel](https://docs.bazel.build/getting-started.html)
  * Follow our tutorials:

    - [Build C++](https://docs.bazel.build/tutorial/cpp.html)
    - [Build Java](https://docs.bazel.build/tutorial/java.html)
    - [Android](https://docs.bazel.build/tutorial/android-app.html)
    - [iOS](https://docs.bazel.build/tutorial/ios-app.html)

## Documentation

  * [Bazel command line](https://docs.bazel.build/user-manual.html)
  * [Rule reference](https://docs.bazel.build/be/overview.html)
  * [Use the query command](https://docs.bazel.build/query.html)
  * [Extend Bazel](https://docs.bazel.build/skylark/concepts.html)
  * [Write tests](https://docs.bazel.build/test-encyclopedia.html)
  * [Roadmap](https://bazel.build/roadmap.html)
  * [Who is using Bazel?](https://github.com/bazelbuild/bazel/wiki/Bazel-Users)

## Contributing to Bazel

See [CONTRIBUTING.md](CONTRIBUTING.md)

[![Build status](https://badge.buildkite.com/1fd282f8ad98c3fb10758a821e5313576356709dd7d11e9618.svg?status=master)](https://ci.bazel.build)
