def update(year,month,level,accounts){
  sh "echo ${year} ${month} ${level} '${accounts}'"
}

def pull(classs,BRANCH,url){
  checkout([$class: "${classs}", 
            branches: [[name: "*/${BRANCH}"]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: "${url}"]]]) 
}

def clean(){
  cleanWs()
}

