def update(year,month,level,account){
  sh "python3 scripts/cur_scripts/tag-tables-update-new.py ${year} ${month} ${level} '${accounts}'"
}

def pull(class_name,name,url){
  
  checkout([$class: ${class_name}, 
            branches: [[name: ${name}]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: ${url}]]]) 
}

def clean(){
  cleanWs()
}
