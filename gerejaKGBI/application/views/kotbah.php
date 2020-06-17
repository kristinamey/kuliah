<div class="mu-single-slide">
				<img src="<?php echo base_url(); ?>kgbi/assets/images/induk.jpg" alt="slider img">
				<div class="mu-single-slide-content-area">
					<div class="container">
						<div class="row">
							<div class="col-md-12">
								<div class="mu-single-slide-content">
									<h1>Berita Gereja KGBI Mojokopek</h1>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>


	<!-- Start Breadcrumb -->
	<div id="mu-breadcrumb">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<nav aria-label="breadcrumb" role="navigation">
					  <ol class="breadcrumb mu-breadcrumb">
					    <li class="breadcrumb-item"><a href="#">Home</a></li>
					    <li class="breadcrumb-item active" aria-current="page">Kotbah</li>
					  </ol>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- End Breadcrumb -->

	
	<!-- Start main content -->
	<main>
		<!-- Start 404 Error -->
		<section id="mu-error">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="mu-error-area">
							<!-- Title -->
							<div class="row">
								<div class="col-md-12">
									<div class="mu-title">
										<h2>Materi Kotbah</h2>
										<p>Anda bisa mengunduh materi kotbah disini</p>
									</div>
								</div>
							</div>

							<!DOCTYPE html>
<body>
				<div class="row">
                    <div class="col-sm-12">
                        <div class="card-box table-responsive">
                            <h4 class="m-t-0 header-title"></h4>
                            <table id="datatable-buttons" class="table table-striped table-bordered">
                                <tr>
                                	<th>No</th>
                                    <th>Tanggal</th>
                                    <th>Pembicara</th>
                                    <th>Tema</th>
                                    <th>Unduh</th>
                                </tr>

                                <?php  
                                	$no = 1;
                                	foreach ($materi_gereja as $u) {
                                ?>
                                <tr>
                                	<td><?php echo $no++ ?></td>
                                	<td><?php echo $u->tanggal ?></td>
                                	<td><?php echo $u->pemateri ?></td>
                                	<td><?php echo $u->tema_kotbah ?></td>
                                	<td>
                                		<a href="<?php echo base_url($u->rangkuman_materi); ?>">Download</a>
                                	</td>
                                </tr>
                                	<?php } 
                                	?>
                            </table>
                        </div>
                    </div>
                </div>



</body>

								<!-- Start Contact Content -->
							
							<!-- End 404 Error  Content -->
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End 404 Error  -->

	</main>
	
	<!-- End main content -->	
			
