## Author : muyiwa, USername, email, uid

##Date : June 2022

## Qa Java Deployment

## Make sure Java is Installed
if
  [ $UID -eq 0 ]
then
    echo "Running as root"
else
    echo "you need root access to continue"
exit 2
fi

echo " Installing java"
sleep 2

yum install java-1.8* -y
if [ $? -eq 0 ]
then
sleep 2
   echo "Successfully created file"
else
   echo "could not create file"
exit 2
fi
echo "installation of wget"

yum install wget unzip -y
if [ $? -eq 0 ]
then
sleep 2
echo " wget successfully installed"