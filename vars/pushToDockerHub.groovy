def call(String project){
  echo "push the image to the dockerhub is started..."
  withCredentials([usernamePassword(credentialsId:"DockerhubCred",passwordVariable : "dockerHubPass", usernameVariable : "dockerHubUser")]){
  sh "sudo docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  echo "Login successfully"
  sh "sudo docker tag ${project}:latest ${env.dockerHubUser}/${project}:latest"
  sh "sudo docker push ${env.dockerHubUser}/${project}:latest"
  echo "pushed  successfully"
}
