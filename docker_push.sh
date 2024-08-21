TAG="1.06"
echo "Building..."
docker build -t practicasdedesarrollounq/java_app:$TAG .

echo "listing images"
docker images

echo "pushing... tag $TAG"
docker push practicasdedesarrollounq/java_app:$TAG



echo "pushing... tag latest"
docker tag practicasdedesarrollounq/java_app:$TAG  practicasdedesarrollounq/java_app:latest
docker push practicasdedesarrollounq/java_app:latest


