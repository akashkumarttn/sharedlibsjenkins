#!/usr/bin/env groovy
def ak = [4]

def sharlib(){
  sh 'echo "this will add when passed args."'
}

def abc(){
  echo "double is custom built in"
}

def a1(ak){
  sh 'echo "cloudkeeper-pro ${ak}"'
  sh 'echo "cloudkeeper-lens"'
  sh 'echo "cloudkeeper-demo"'
}

def b1(){
  sh 'echo "cloudkeeper-demo"'
  sh 'echo " first demo for shared jenkins library"'
  sh 'echo "this will add when passed args."'
}

def add(x,y){
  echo "sum of ${x} and ${y} is ${x+y}"
}
