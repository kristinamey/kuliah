

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
                            <h4 class="m-t-0 header-title"><b>ADMIN KGBI MOJOKOPEK</b></h4>
                                <div style="text-align: right; margin-bottom: 10px;">
                                <a href='#' class="on-default edit-row btn btn-success" data-toggle="modal" data-target="#custom-width-modal" onClick="ResetInput()" class="col-sm-6 col-md-4 col-lg-3">
                                    <i class="ti-plus"></i></a>
                                </div>

                            <table id="datatable-buttons" class="table table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>No</th>
                                    <th>Name</th>
                                    <th>Nomor handphone</th>
                                    <th>Username</th>
                                    <th>Katasandi</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                     <?php 
                                    $no = 1;
                                    foreach($admin as $u){ 
                                        echo"<tr>
                                        <td>".$no."</td>
                                        <td>".$u->nama_admin."</td>
                                        <td>".$u->noHp."</td>
                                        <td>".$u->username."</td>
                                        <td>".$u->katasandi."</td>
                                        <td>
                                            <a href ='#' class ='on-default edit-row btn btn-custom btn-primary' data-toggle='modal' data-target='#custom-width-modal' onClick=\"SetInput('".$u->idAdmin."','".$u->nama_admin."','".$u->noHp."','".$u->username."','".$u->katasandi."')\"><i class ='fa fa-pencil'></i></a>

                                             <a href ='#' class ='on-default remove-row btn btn-custom btn-danger' data-toggle='modal' data-target='#delete-modal'onClick=\"setInput1('".$u->idAdmin."')\"><i class ='fa fa-trash'></i></a>
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
                        <h4 class="modal-title">DATA ADMIN</h4>
                    </div>
                        <form action="<?php echo base_url(). 'conkaryawan/add'; ?>" method="post"> 
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    
                                    <label for="field-1" class="control-label">Nama Admin</label>
                                    <input type="hidden" id="idAdmin" name="idAdmin">
                                    <input type="text" class="form-control" id="nama_admin" name="nama_admin" required>
                                </div>
                            </div>
                        </div>
                    </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Nomor Handphone</label>
                                    <input type="text" class="form-control" id="noHp" name="noHp" required >
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Username</label>
                                    <input type="text" class="form-control" id="username" name="username" required >
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Katasandi</label>
                                    <input type="text" class="form-control" id="katasandi" name="katasandi" required >
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
                        <h4 class="modal-title" id="custom-width-modalLabel">DATA ADMIN</h4>
                    </div>
                    <form action="<?php echo base_url().'conkaryawan/hapus';?>" method="post" class="form-horizontal" role="form">
                    <div class="modal-body">
                        <h4>Konfirmasi</h4>
                        <p>Apakah anda yakin ingin menghapus data ini ?</p>
                        <div class="form-group">
                             <input type="hidden" id="idAdmin1" name="idAdmin1">
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
                function SetInput(idAdmin, nama_admin,noHp, username, katasandi) {
                    document.getElementById('idAdmin').value = idAdmin;
                    document.getElementById('nama_admin').value = nama_admin;
                    document.getElementById('noHp').value = noHp;
                    document.getElementById('username').value = username;
                    document.getElementById('katasandi').value = katasandi;
                }
                function setInput1(idAdmin) {
                    document.getElementById('idAdmin1').value = idAdmin;
                }

                function ResetInput(idAdmin, nama_admin,noHp, username, katasandi) {
                    document.getElementById('idAdmin').value ="" ;
                    document.getElementById('nama_admin').value ="" ;
                    document.getElementById('noHp').value = "" ;
                    document.getElementById('username').value = "";
                    document.getElementById('katasandi').value = "";
                }
                </script>
                //</div> <!-- content -->