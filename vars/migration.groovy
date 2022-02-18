def update(year,month,level,account){
  sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${year} ${month} ${level} '${accounts}'"
}

def pull(Map){
  
  checkout([$class: "*/${classs}", 
            branches: [[name: "*/${BRANCH}"]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: "${url}"]]]) 
}

def clean(){
  cleanWs()
}

def class_name(Map){
  $class: GitSCM
  name: main
  url: 'https://github.com/akashkumarttn/sharedlibsjenkins.git'
}
