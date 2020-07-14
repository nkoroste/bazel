load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# This must be kept in sync with the top-level WORKSPACE file.
http_archive(
    name = "android_tools",
    sha256 = "7b9ced735667a9ad94693b7046640b7264521d4f613622072b8767fc4f48b887",
    url = "https://storage.googleapis.com/snap-bazel-releases/bazel_android_tools/android_tools_pkg-0.19.0rc1-snap-0.2.tar.gz",
    auth_patterns = {
        "storage.googleapis.com": "Bearer <password>",
    },
)
