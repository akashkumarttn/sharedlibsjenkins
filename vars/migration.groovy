def update(year,month,level,account){
  sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${year} ${month} ${level} '${accounts}'"
}

def pull(Map stageParams){
  
 	checkout([$class: 'GitSCM', 
            branches: [[name: stageParams.branch]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: 'https://github.com/akashkumarttn/sharedlibsjenkins.git']]]) 
}

def clean(){
  cleanWs()
}
