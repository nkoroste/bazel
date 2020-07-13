load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# This must be kept in sync with the top-level WORKSPACE file.
http_archive(
    name = "android_tools",
    sha256 = "7bca97a3352c26bcd7a6800720370f1bac8a69ccf540c927c96d2ed7498d2fd0",
    url = "https://storage.googleapis.com/snap-bazel-releases/bazel_android_tools/android_tools_pkg-0.19.0rc1-snap-0.1.tar.gz",
    auth_patterns = {
        "storage.googleapis.com": "Bearer <password>",
    },
)
