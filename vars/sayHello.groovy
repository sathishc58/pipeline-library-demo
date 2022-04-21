#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  yarn install
  yarn build
}

def buildyarn() {
  yarn install
  yarn build
}
