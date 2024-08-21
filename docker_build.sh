echo "Building Jar ..."
./gradlew build

echo "Building image ..."

docker build -t go-java_app .

echo "listing images"
docker images