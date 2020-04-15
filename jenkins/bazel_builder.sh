#!/usr/bin/env bash
# Builder for bazel binaries

# Install bazelisk
source $(dirname $BASH_SOURCE)/bazel_utils.sh
ensure_bazelisk

# fail on errors
set -e

echo "Building bazel for commit $head_commit..."
${BAZELISK_COMMAND} build //src:bazel --compilation_mode=opt

