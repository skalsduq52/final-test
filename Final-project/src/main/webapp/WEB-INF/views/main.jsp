<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <style>
           .navigation{
                width: 60px;
                height: 100%;
                position: fixed;
                background: #00a1b9;
                transition: 0.5s;
                overflow: hidden;
            }
            
            .navigation:hover{
                width: 200px;
            }

            .navigation ul{
                position:absolute;
                top:0;
                left:0;
                width:100%;
                padding-inline-start: 0%;
            }
            .navigation ul li{
                position:relative;
                width:100%;
                list-style: none;
            }
            .navigation ul li:hover{
                background: rgb(112, 214, 218);
            }

            .navigation ul li a{
                position:relative;
                display:block;
                width:100%;
                display:flex;
                text-decoration: none;
                color: white;
            }

            .navigation ul li a .icon{
                position:relative;
                display:block;
                min-width: 60px;
                height: 60px;
                line-height: 60px;
                text-align: center;
            }
            .navigation ul li a .icon .fa{
                font-size: 24px;
            }
            .navigation ul li a .title{
                position:relative;
                display:block;
                padding:0 10px;
                min-width: 60px;
                height: 60px;
                line-height: 60px;
                text-align: start;
                white-space: nowrap;
            }

            /* header:hover{
                width: 150px;
                transition:0.3s;
            } */
            
            
            nav{
                margin-left: 56px;
                width: 95%;
                height: 80px;
            }
            main {
                margin-left: 56px;
                width: 95%;
                height: 920px;
            }
            footer{
                margin-left: 56px;
                width: 95%;
                height: 80px;
            }
        </style>
        <title>josso</title>
        <!-- Icon -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
        crossorigin="anonymous">
        <!-- 부트스트랩 css 사용 -->
        <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
        integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
        crossorigin="anonymous">
        <!-- 부트스트랩 js 사용 -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
        crossorigin="anonymous"></script>
        <!-- 반응형 웹 디자인 적용 -->
        <meta name="viewport" content="width=device width" initial-scale="1">
        
    </head>
    <body>
        <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fa fa-home" aria-hidden="true"></i></span>
                    <span class="title">홈</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fa fa-envelope" aria-hidden="true"></i></span>
                    <span class="icon">이메일</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fas fa-list-ul fa-lg" aria-hidden="true"></i></span>
                    <span class="icon">게시판</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fas fa-calendar-alt fa-lg" aria-hidden="true"></i></span>
                    <span class="icon">일정</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fas fa-clock fa-lg" aria-hidden="true"></i></span>
                    <span class="icon">Calendar</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fas fa-clipboard fa-lg" aria-hidden="true"></i></span>
                    <span class="icon">Calendar</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                    <span class="icon"><i class="fas fa-user-friends fa-lg" aria-hidden="true"></i></span>
                    <span class="icon">Calendar</span>
                    </a>
                </li>
               
            </ul>
        </div>
        <nav class="border-bottom">
            <!-- Navbar content -->
        </nav>
        <aside>
           
                
        </aside>
        <main>
            <div>
                <!-- <img src="../images/flower1.PNG"><br> -->
                

            </div>
        </main>
        <footer class="border-top">

        </footer>
    </body>
</html>