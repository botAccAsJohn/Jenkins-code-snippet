def call(String name){
 echo "this is building stage... "
 sh "sudo docker build -t '${name}:latest' ."
 echo "this is building stage is Done ! " 
}
