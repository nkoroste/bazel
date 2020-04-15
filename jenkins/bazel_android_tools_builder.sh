#!/usr/bin/env bash
# Builder for bazel Android tools jars

# Install bazelisk
source $(dirname $BASH_SOURCE)/bazel_utils.sh
ensure_bazelisk

# fail on errors
set -e

export BAZEL_HOME=$(pwd .)
echo "Building bazel Android tools jar for commit $head_commit..."
${BAZELISK_COMMAND} run //tools/android/runtime_deps:upload_android_tools

git add WORKSPACE
git add src/.
git commit -m "Applying new Android tools version."
git push origin HEAD:$branch