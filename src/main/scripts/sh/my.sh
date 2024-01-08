echo "This is my shell"

a=$(ls -lrt /bin | wc -l)
echo $a

for i in {1..10} ; do
  echo $i
done;

i=0
while [ $i -lt 5 ];
do
  echo $i
  i=`expr $i + 1`
done;

a=1
b=10
echo Addition of $a and $b is $(($a+$b))

