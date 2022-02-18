def update(year,month,level,account){
  sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${year} ${month} ${level} '${accounts}'"
}

def pull(Map stageParams){
  #sh 'git config --global http.sslverify "false"'
 	checkout([$class: 'GitSCM', 
            branches: [[name: stageParams.branch]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            #userRemoteConfigs: [[credentialsId: 'd153af68-8f30-4c55-bfe4-646037e020f0', 
            url: stageParams.url]]]) 
}

def clean(){
  cleanWs()
}
