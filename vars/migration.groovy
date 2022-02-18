def update(year,month,level,account){
  sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${year} ${month} ${level} '${accounts}'"
}

def pull(Map){
  
  checkout([$class: def class_name(Map), 
            branches: [[name: def class_name(Map)]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: def class_name(Map)]]]) 
}

def clean(){
  cleanWs()
}

def class_name(Map){
  $class: GitSCM
  name: main
  url: 'https://github.com/akashkumarttn/sharedlibsjenkins.git'
}
