freeStyleJob('tst123') {
  scm {
    git {      
      branches('*/master')      
      remote {        
        url('https://github.com/octocat/Hello-World.git')                
      }      
    }    
  }    
  configure { project ->    
    project / 'scm' << 'submoduleCfg'(class:'list')    
  }
  
}