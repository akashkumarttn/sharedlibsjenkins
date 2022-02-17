def update(year,month,level,account){
  sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${year} ${month} ${level} '${accounts}'"
}

def pull(){
  sh 'git config --global http.sslverify "false"'
 	checkout([$class: 'GitSCM', branches: [[name: 'prod-migration1']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'd153af68-8f30-4c55-bfe4-646037e020f0', url: 'git@gitlab.intelligrape.net:tothenew/mycloud-scripts.git']]]) 
}

def clean(){
  cleanWs()
}
