#!/usr/bin/env groovy
def sharlib(){
  sh 'echo "this will add when passed args."'
}

def abc(){
  echo "double is custom built in"
}

def a1(){
  sh 'echo "cloudkeeper-pro"'
  sh 'echo "cloudkeeper-lens"'
  sh 'echo "cloudkeeper-demo"'
}

def b1(){
  sh 'echo "cloudkeeper-demo"'
  sh 'echo " first demo for shared jenkins library"'
  sh 'echo "this will add when passed args."'
}
