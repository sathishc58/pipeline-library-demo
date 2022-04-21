#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def build() {
  yarn install
  yarn build
}
