load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# This must be kept in sync with the top-level WORKSPACE file.
http_archive(
    name = "android_tools",
    sha256 = "5cdf643e47536b4a3f023d8ee68717213106ecf9e00e6777f65186ef0e960fac",
    url = "https://storage.googleapis.com/snap-bazel-releases/bazel_android_tools/android_tools_pkg-0.19.0rc1-snap-0.4.tar.gz",
    auth_patterns = {
        "storage.googleapis.com": "Bearer <password>",
    },
)
