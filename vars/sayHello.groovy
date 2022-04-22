#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def buildyarn() {
  echo "Build yarn"
}
