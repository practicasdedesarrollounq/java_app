TAG="1.05"
echo "Building..."
docker build -t practicasdedesarrollounq/java_app:$TAG .

echo "listing images"
docker images

echo "pushing... tag $TAG"
docker push practicasdedesarrollounq/java_app:$TAG



echo "pushing... tag latest"
docker build tag practicasdedesarrollounq/java_app:$TAG  practicasdedesarrollounq/java_app:latest
docker push practicasdedesarrollounq/java_app:latest


