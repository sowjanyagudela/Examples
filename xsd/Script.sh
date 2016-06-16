echo "Creating Java Files \n ***********************************"
xjc -extension -d . -p  com.student Student.xsd StudentResponse.xsd Serializable.xsd



echo "**************************************"
cd com/student
echo "Compiling Java classes \n "
javac -d . *.java
echo "****************************************** \n Creating Jar File \n ******************************************"
jar -cvf student.jar com/student
echo "****************************** \n Creating Docs \n ********************************"
javadoc -d docs *.java
echo "*********************************"

