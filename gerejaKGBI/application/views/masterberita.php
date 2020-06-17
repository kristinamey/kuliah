



            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->
            <div class="content-page">
                <!-- Start content -->
                <div class="content">
                    <div class="container">

                        <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box table-responsive">
                            <h4 class="m-t-0 header-title"><b>BERITA GEREJA KGBI MOJOKOPEK</b></h4>
                            <div style="text-align: right; margin-bottom: 10px;">
                                <a href='#' class="on-default edit-row btn btn-success" data-toggle="modal" data-target="#custom-width-modal" onClick="ResetInput()" class="col-sm-6 col-md-4 col-lg-3">
                                    <i class="ti-plus"></i></a>
                                </div>
                            
                            <table id="datatable-buttons" class="table table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>No</th>
                                    <th>Judul Berita</th>
                                    <th>Deskripsi Berita</th>
                                    <th>Gambar</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                          <?php 
                                    $no = 1;
                                    foreach($berita_gereja as $u){ 
                                        echo"<tr>
                                        <td>".$no."</td>
                                        <td>".$u->judul_berita."</td>
                                        <td>".$u->deskripsi_berita."</td>
                                        <td><img src='".base_url('').$u->gambar_berita."'width=400px></td>
                                        <td>
                                            <a href ='#' class ='on-default edit-row btn btn-custom btn-primary' data-toggle='modal' data-target='#custom-width-modal' onClick=\"SetInput('".$u->idBerita_gereja."','".$u->judul_berita."','".$u->deskripsi_berita."','".$u->gambar_berita."')\"><i class ='fa fa-pencil'></i></a>

                                             <a href ='#' class ='on-default remove-row btn btn-custom btn-danger' data-toggle='modal' data-target='#delete-modal'onClick=\"setInput1('".$u->idBerita_gereja."')\"><i class ='fa fa-trash'></i></a>
                                        </td>
                                    </tr>";
                                    $no++;
                                    } 
                                    ?>
                                
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
          </div>    
      </div> 
    </div>


        <div id="custom-width-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">DATA BERITA KGBI MOJOKOPEK</h4>
                    </div>
                        <form action="<?php echo base_url(). 'conmasterberita/add'; ?>" method="post" enctype="multipart/form-data"> 
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    
                                    <label for="field-1" class="control-label">Judul Berita</label>
                                    <input type="hidden" id="idberita_gereja" name="idberita_gereja">
                                    <input type="text" class="form-control" id="judul_berita" name="judul_berita" required>
                                </div>
                            </div>
                        </div>
                    </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Deskripsi Berita</label>
                                    <input type="text" class="form-control" id="deskripsi_berita" name="deskripsi_berita" required >
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Gambar Berita</label>
                                    <input type="hidden" id="idBerita_gereja" name="idBerita_gereja">
                                    <input type="file" class="form-control" id="gambar_berita" name="gambar_berita" accept="image/png" required >
                                </div>
                            </div>
                        </div>
                            <div class="model-footer">
                                <button type="submit" class="btn btn-primary waves-effect waves-light">Simpan</button>
                                <button type="submit" class="btn btn-default waves-effect waves-light" data-dismiss="modal">Batal</button>
                           </div>
                        </form>
                    </div>
                </div>
            </div>


        <div id="delete-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="custom-width-modalLabel" aria-hidden="true" style="display: none;">
            <div class="modal-dialog" style="width:55%;">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title" id="custom-width-modalLabel">DATA BERITA KGBI MOJOKOPEK</h4>
                    </div>
                    <form action="<?php echo base_url().'conmasterberita/hapus';?>" method="post" class="form-horizontal" role="form">
                    <div class="modal-body">
                        <h4>Konfirmasi</h4>
                        <p>Apakah anda yakin ingin menghapus data ini ?</p>
                        <div class="form-group">
                             <input type="hidden" id="idberita_gereja1" name="idberita_gereja1">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-danger waves-effect" data-dismiss="modal">Tidak</button>
                        <button type="submit" class="btn btn-success waves-effect waves-light">Ya</button>
                    </div>
                    </form>
            
                <!-- /.modal-content -->
                </div>
            </div>
            <!-- /.modal-dialog -->
        </div>
                    <!-- content -->

                <script type="text/javascript">
                function SetInput(idberita_gereja, judul_berita,deskripsi_berita, gambar_berita) {
                    document.getElementById('idberita_gereja').value = idberita_gereja;
                    document.getElementById('judul_berita').value = judul_berita;
                    document.getElementById('deskripsi_berita').value = deskripsi_berita;
                    document.getElementById('gambar_berita').value = gambar_berita;
                }
                function setInput1(idberita_gereja) {
                    document.getElementById('idberita_gereja1').value = idberita_gereja;
                }

                function ResetInput(idberita_gereja, judul_berita,deskripsi_berita, gambar_berita) {
                    document.getElementById('idberita_gereja').value ="" ;
                    document.getElementById('judul_berita').value ="" ;
                    document.getElementById('deskripsi_berita').value = "" ;
                    document.getElementById('gambar_berita').value = "";
                }
            </script>

