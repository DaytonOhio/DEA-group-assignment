import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<%@ page import="java.sql.*, com.workoutplanner.db.workoutplanner" %>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>WORKOUT PLANNER</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@400;500;600;700&family=Rubik&display=swap" rel="stylesheet">

        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">
        <link href="lib/flaticon/font/flaticon.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous" />
        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>
        <!-- Header Start -->
        <div class="container-fluid bg-dark px-0">
            <div class="row gx-0">
                <div class="col-lg-3 bg-dark d-none d-lg-block">
                    <a href="" class="navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center">
                    </a>
                </div>
                <div class="col-lg-9">
                    <div class="row gx-0 bg-secondary d-none d-lg-flex">
                        <div class="col-lg-7 px-5 text-start navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0 px-lg-5">

                        </div>
                        <div class="col-lg-5 px-5 text-end navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0 px-lg-5">

                        </div>
                    </div>
                    <nav class="navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0 px-lg-5">
                        <a href="/index" class="navbar-brand d-block d-lg-none">
                        </a>
                        <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                            <div class="navbar-nav mr-auto py-0">
                                <a href="/coach" class="nav-item nav-link">Dashboard</a>
                                <a href="/admin" class="nav-item nav-link">Administrator Options</a>
                                <a href="/team" class="nav-item nav-link active">View Athletes</a>
                            </div>
                            <a href="/index" class="nav-item nav-link">Log Out</a>

                            <a class=" py-md-3 px-md-5 d-none text-white d-lg-block">[COACH USERNAME]</a>

                        </div>
                    </nav>
                </div>
            </div>
        </div>
        <!-- Header End -->


        <!-- Hero Start -->
        <div class="container-fluid bg-dark p-5 bg-hero mb-5">
            <div class="row py-5">
                <div class="col-12 text-center">
                    <h1 class="display-2 text-uppercase text-white mb-md-4">Athlete List</h1>

                </div>
            </div>
        </div>
        <!-- Hero End -->

        <!-- Athletes Start -->
        <nav>
            <main>
                <section>
                    <h3>Athletes</h3>
                    <ul class="actions">
                        system.out.println("hello world");
                        <li><a href="#">Create Coach</a></li>
                    </ul>
                </section>
            </main>
        </nav>

        <!-- Back to Top -->
        <a href="#" class="btn btn-dark py-3 fs-4 back-to-top"><i class="bi bi-arrow-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/waypoints/waypoints.min.js"></script>
        <script src="lib/counterup/counterup.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>

</html>