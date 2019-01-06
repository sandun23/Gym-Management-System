drop database GymManagement;
create database GymManagement;
use GymManagement;

create table Client(
	ClientID varchar(10)not null,
	NIC varchar(12)not null,
	F_Name varchar(20)not null,
	L_Name varchar(20)not null,
	Gender varchar(6)not null,
	Age int(10) not null,
	Address varchar(100)not null,
	Email varchar(50),
	TelNo int(10)not null,
	Constraint primary key(ClientID)
)engine=innodb default charset=latin1;

create table Registration(
	Membership_No varchar(10)not null,
	R_Date varchar(20)not null,
	ClientID varchar(10)not null,
	constraint primary key(Membership_No),
	constraint foreign key(ClientID)references Client(ClientID)
	on delete cascade on update cascade
)engine=innodb default charset=latin1;

create table Attendance(
	AID varchar(10)not null,
	A_Date varchar(20)not null,
	In_Time varchar(20)not null,
	Out_Time varchar(20)not null,
	Membership_No varchar(10)not null,
	Constraint primary key(AID),
	constraint foreign key(Membership_No)references Registration(Membership_No)
	on delete cascade on update cascade
)engine=innodb default charset=latin1;

create table Payment(
	PID varchar(10)not null,
	P_Date varchar(10) not null,
	types varchar(20)not null,
	Amount decimal(10,2)not null,
	Membership_No varchar(10)not null,
	constraint primary key(PID),
	constraint foreign key(Membership_No)references Registration(Membership_No)
	on delete cascade on update cascade
)engine=innodb default charset=latin1;
	
create table Instructor(
	InstructorID varchar(10)not null,
	NIC varchar(12)not null,
	F_Name varchar(20)not null,
	L_Name varchar(20)not null,
	Gender varchar(6)not null,
	Age int(10) not null,
	Address varchar(100)not null,
	Email varchar(50),
	TelNo int(10)not null,
	Constraint primary key(InstructorID)
)engine=innodb default charset=latin1;

create table Schedule(
	Schedule_No varchar(10)not null,
	Start_Date varchar(20) not null,
	End_Date varchar(20) not null,
	Membership_No varchar(10)not null,
	InstructorID varchar(10)not null,
	constraint primary key(Schedule_No),
	constraint foreign key(Membership_No)references Registration(Membership_No)
	on delete cascade on update cascade,
	constraint foreign key(InstructorID)references Instructor(InstructorID)
	on delete cascade on update cascade
)engine=innodb default charset=latin1;

create table Exercise(
	EID varchar(10)not null,
	E_Name varchar(30)not null,
	Constraint primary key(EID)
)engine=innodb default charset=latin1;

create table ScheduleDetails(
	SDID varchar(10)not null,
	ggg varchar(10)not null,
	EID varchar(10)not null,
	Schedule_No varchar(10)not null,
	constraint primary key(SDID),
	constraint foreign key(EID)references Exercise(EID)
	on delete cascade on update cascade,
	constraint foreign key(Schedule_No)references Schedule(Schedule_No)
	on delete cascade on update cascade
)engine=innodb default charset=latin1;

create table Measurement(
	MID varchar(10)not null,
	Neck decimal(10,2)not null,
	Chest decimal(10,2)not null,
	Abdomen decimal(10,2)not null,
	Waist decimal(10,2)not null,
	Weight decimal(10,2)not null,
	Height decimal(10,2)not null,
	LThight decimal(10,2)not null,
	RThight decimal(10,2)not null,
	LArm decimal(10,2)not null,
	RArm decimal(10,2)not null,
	LForearm decimal(10,2)not null,
	RForearm decimal(10,2)not null,
	LCalf decimal(10,2)not null,
	RCalf decimal(10,2)not null,
	Schedule_No varchar(10)not null,
	Constraint primary key(MID),
	constraint foreign key(Schedule_No)references Schedule(Schedule_No)
	on delete cascade on update cascade
)engine=innodb default charset=latin1;




