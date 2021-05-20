create database user_db
use Bai14


create table books(
id int IDENTITY(1,1) PRIMARY KEY,
name nvarchar(50), 
author nvarchar(50), 
publishyear int,
rating float
)


insert Books values(N'Anh văn',N'Nhà xuất bản giáo dục',2000,5)
insert Books values(N'Toán',N'Nhà xuất bản giáo dục',2000,5)
insert Books values(N'Ngữ văn',N'Nhà xuất bản giáo dục',2000,5)
insert Books values(N'GDCD',N'Nhà xuất bản giáo dục',2000,5)
insert Books values(N'Lịch sử',N'Nhà xuất bản giáo dục',2000,5)
insert Books values(N'Địa lí',N'Nhà xuất bản giáo dục',2000,5)
