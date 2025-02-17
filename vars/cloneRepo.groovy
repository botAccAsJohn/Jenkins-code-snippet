def call(String url,String branch){
    echo "this is cloning stage..."
    git url : url  , branch: branch
    echo "this is cloning stage id Done !"  
}
