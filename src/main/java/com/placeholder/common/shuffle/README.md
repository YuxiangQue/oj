

# 蓄水池算法
http://www.cnblogs.com/afarmer/archive/2013/03/30/2991059.html

- 定义取出的行号为choice，第一次直接以第一行作为取出行 choice ，而后第二次以二分之一概率决定是否用第二行替换 choice ，第三次以三分之一的概率决定是否以第三行替换 choice ……，以此类推。
  
- 先把前k个数放入蓄水池，对第k+1，我们以k/(k+1)概率决定是否要把它换入蓄水池，换入时随机的选取一个作为替换项，这样一直做下去，对于任意的样本空间n，对每个数的选取概率都为k/n。也就是说对每个数选取概率相等。