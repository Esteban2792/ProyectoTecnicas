USE [master]
GO
/****** Object:  Database [pruebaUno]    Script Date: 13/12/2021 22:41:25 ******/
CREATE DATABASE [pruebaUno]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'pruebaUno', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\pruebaUno.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'pruebaUno_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\pruebaUno_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [pruebaUno] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [pruebaUno].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [pruebaUno] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [pruebaUno] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [pruebaUno] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [pruebaUno] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [pruebaUno] SET ARITHABORT OFF 
GO
ALTER DATABASE [pruebaUno] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [pruebaUno] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [pruebaUno] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [pruebaUno] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [pruebaUno] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [pruebaUno] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [pruebaUno] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [pruebaUno] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [pruebaUno] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [pruebaUno] SET  ENABLE_BROKER 
GO
ALTER DATABASE [pruebaUno] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [pruebaUno] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [pruebaUno] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [pruebaUno] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [pruebaUno] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [pruebaUno] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [pruebaUno] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [pruebaUno] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [pruebaUno] SET  MULTI_USER 
GO
ALTER DATABASE [pruebaUno] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [pruebaUno] SET DB_CHAINING OFF 
GO
ALTER DATABASE [pruebaUno] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [pruebaUno] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [pruebaUno] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [pruebaUno] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [pruebaUno] SET QUERY_STORE = OFF
GO
USE [pruebaUno]
GO
/****** Object:  Table [dbo].[citaPost]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[citaPost](
	[idCitaP] [int] IDENTITY(1,1) NOT NULL,
	[idHospital] [int] NULL,
	[idOperacion] [int] NULL,
	[idPaciente] [int] NULL,
	[fechaCita] [date] NULL,
 CONSTRAINT [PK_idCitaPOST] PRIMARY KEY CLUSTERED 
(
	[idCitaP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[doctor]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[doctor](
	[idDoctor] [int] IDENTITY(1,1) NOT NULL,
	[identificacion] [nvarchar](20) NULL,
	[nombre] [nvarchar](10) NULL,
	[apellidos] [nvarchar](30) NULL,
	[especialidades] [nvarchar](100) NULL,
 CONSTRAINT [PK_IdDoctor] PRIMARY KEY CLUSTERED 
(
	[idDoctor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hospitales]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hospitales](
	[idHospital] [int] IDENTITY(1,1) NOT NULL,
	[tipoPropiedad] [nvarchar](20) NOT NULL,
	[consultorios] [int] NOT NULL,
	[niveles] [int] NOT NULL,
	[color] [nvarchar](10) NULL,
	[tipoCirugias] [nvarchar](150) NULL,
	[descripcion] [nvarchar](300) NULL,
 CONSTRAINT [PK_IdHospital] PRIMARY KEY CLUSTERED 
(
	[idHospital] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[internamientos]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[internamientos](
	[idInternamiento] [int] IDENTITY(1,1) NOT NULL,
	[idHospital] [int] NULL,
	[idPaciente] [int] NULL,
	[motivo] [nvarchar](100) NULL,
 CONSTRAINT [PK_IdInternamiento] PRIMARY KEY CLUSTERED 
(
	[idInternamiento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[login]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[login](
	[idUsuario] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [nvarchar](10) NULL,
	[apellidos] [nvarchar](30) NULL,
	[contraseña] [nvarchar](20) NULL,
	[tipoDeUsuario] [nvarchar](10) NULL,
	[estado] [bit] NULL,
	[nombreUsuario] [nvarchar](50) NULL,
 CONSTRAINT [PK_IdUsuario] PRIMARY KEY CLUSTERED 
(
	[idUsuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[operaciones]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[operaciones](
	[idOperacion] [int] IDENTITY(1,1) NOT NULL,
	[idHospital] [int] NULL,
	[idDoctor] [int] NULL,
	[idPaciente] [int] NULL,
	[tipoOperacion] [nvarchar](100) NULL,
 CONSTRAINT [PK_IdOperacion] PRIMARY KEY CLUSTERED 
(
	[idOperacion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[pacientes]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pacientes](
	[idPaciente] [int] IDENTITY(1,1) NOT NULL,
	[identificacion] [nvarchar](20) NULL,
	[nombre] [nvarchar](10) NULL,
	[apellidos] [nvarchar](30) NULL,
	[estadoCivil] [nvarchar](10) NULL,
	[patologia] [nvarchar](20) NULL,
	[telefono] [nvarchar](12) NULL,
	[email] [nvarchar](30) NULL,
	[estadoPaciente] [bit] NULL,
 CONSTRAINT [PK_IdPaciente] PRIMARY KEY CLUSTERED 
(
	[idPaciente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[pagos]    Script Date: 13/12/2021 22:41:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[pagos](
	[idPago] [int] IDENTITY(1,1) NOT NULL,
	[idHospital] [int] NULL,
	[idOperacion] [int] NULL,
	[idPaciente] [int] NULL,
	[fechaPago] [date] NULL,
	[intervenciones] [nvarchar](150) NULL,
	[total] [money] NULL,
 CONSTRAINT [PK_IdPago] PRIMARY KEY CLUSTERED 
(
	[idPago] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[citaPost]  WITH CHECK ADD  CONSTRAINT [FK_IdHospitalCITA] FOREIGN KEY([idHospital])
REFERENCES [dbo].[hospitales] ([idHospital])
GO
ALTER TABLE [dbo].[citaPost] CHECK CONSTRAINT [FK_IdHospitalCITA]
GO
ALTER TABLE [dbo].[citaPost]  WITH CHECK ADD  CONSTRAINT [FK_IdOperacionCITA] FOREIGN KEY([idOperacion])
REFERENCES [dbo].[operaciones] ([idOperacion])
GO
ALTER TABLE [dbo].[citaPost] CHECK CONSTRAINT [FK_IdOperacionCITA]
GO
ALTER TABLE [dbo].[citaPost]  WITH CHECK ADD  CONSTRAINT [FK_IdPacienteCITA] FOREIGN KEY([idPaciente])
REFERENCES [dbo].[pacientes] ([idPaciente])
GO
ALTER TABLE [dbo].[citaPost] CHECK CONSTRAINT [FK_IdPacienteCITA]
GO
ALTER TABLE [dbo].[internamientos]  WITH CHECK ADD  CONSTRAINT [FK_IdHospitales] FOREIGN KEY([idHospital])
REFERENCES [dbo].[hospitales] ([idHospital])
GO
ALTER TABLE [dbo].[internamientos] CHECK CONSTRAINT [FK_IdHospitales]
GO
ALTER TABLE [dbo].[internamientos]  WITH CHECK ADD  CONSTRAINT [FK_IdPacientes] FOREIGN KEY([idPaciente])
REFERENCES [dbo].[pacientes] ([idPaciente])
GO
ALTER TABLE [dbo].[internamientos] CHECK CONSTRAINT [FK_IdPacientes]
GO
ALTER TABLE [dbo].[operaciones]  WITH CHECK ADD  CONSTRAINT [FK_IdDoctor] FOREIGN KEY([idDoctor])
REFERENCES [dbo].[doctor] ([idDoctor])
GO
ALTER TABLE [dbo].[operaciones] CHECK CONSTRAINT [FK_IdDoctor]
GO
ALTER TABLE [dbo].[operaciones]  WITH CHECK ADD  CONSTRAINT [FK_IdHospital] FOREIGN KEY([idHospital])
REFERENCES [dbo].[hospitales] ([idHospital])
GO
ALTER TABLE [dbo].[operaciones] CHECK CONSTRAINT [FK_IdHospital]
GO
ALTER TABLE [dbo].[operaciones]  WITH CHECK ADD  CONSTRAINT [FK_IdPaciente] FOREIGN KEY([idPaciente])
REFERENCES [dbo].[pacientes] ([idPaciente])
GO
ALTER TABLE [dbo].[operaciones] CHECK CONSTRAINT [FK_IdPaciente]
GO
ALTER TABLE [dbo].[pagos]  WITH CHECK ADD  CONSTRAINT [FK_IDHospitalP] FOREIGN KEY([idHospital])
REFERENCES [dbo].[hospitales] ([idHospital])
GO
ALTER TABLE [dbo].[pagos] CHECK CONSTRAINT [FK_IDHospitalP]
GO
ALTER TABLE [dbo].[pagos]  WITH CHECK ADD  CONSTRAINT [FK_IDOperacionP] FOREIGN KEY([idOperacion])
REFERENCES [dbo].[operaciones] ([idOperacion])
GO
ALTER TABLE [dbo].[pagos] CHECK CONSTRAINT [FK_IDOperacionP]
GO
ALTER TABLE [dbo].[pagos]  WITH CHECK ADD  CONSTRAINT [FK_IDPacienteP] FOREIGN KEY([idPaciente])
REFERENCES [dbo].[pacientes] ([idPaciente])
GO
ALTER TABLE [dbo].[pagos] CHECK CONSTRAINT [FK_IDPacienteP]
GO
USE [master]
GO
ALTER DATABASE [pruebaUno] SET  READ_WRITE 
GO
