#!/usr/bin/env bash

# don't fail on errors
set +e

BAZELISK_COMMAND=bazelisk
GO_COMMAND=go
COMMIT=$(git rev-parse HEAD)

function ensure_bazelisk() {
  hash ${BAZELISK_COMMAND} > /dev/null 2>&1
  if [[ $? -ne 0 ]]; then
    # Adds go to PATH if it doesn't exist on the PATH
    hash ${GO_COMMAND} > /dev/null 2>&1
    if [[ $? -ne 0 ]]; then
      echo "$GO_COMMAND is missing. Installing..."
      sudo snap install --classic go
    fi
    # Add GO to PATH if it doesn't exist
    echo $PATH | grep "$(go env GOPATH)/bin" > /dev/null
    if [[ $? -ne 0 ]]; then
      export PATH=$PATH:$(go env GOPATH)/bin
    fi
    go get github.com/bazelbuild/bazelisk
  fi
}