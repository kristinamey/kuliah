



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
                            <h4 class="m-t-0 header-title"><b>MATERI KOTBAH GEREJA KGBI MOJOKOPEK</b></h4>
                            <div style="text-align: right; margin-bottom: 10px;">
                                <a href='#' class="on-default edit-row btn btn-success" data-toggle="modal" data-target="#custom-width-modal" onClick="ResetInput()" class="col-sm-6 col-md-4 col-lg-3">
                                    <i class="ti-plus"></i></a>
                                </div>
                            
                            <table id="datatable-buttons" class="table table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>No</th>
                                    <th>Tema Kotbah</th>
                                    <th>Tanggal</th>
                                    <th>Pembicara</th>
                                    <th>Rangkuman Materi</th>
                                    <th>Action</th>
                                </tr>
                                </thead>


                                <tbody>
                                 <?php 
                                    $no = 1;
                                    foreach($materi_gereja as $u){ 
                                        echo"<tr>
                                        <td>".$no."</td>
                                        <td>".$u->tema_kotbah."</td>
                                        <td>".$u->tanggal."</td>
                                        <td>".$u->pemateri."</td>
                                        <td>".$u->rangkuman_materi."</td>
                                        <td>
                                            <a href ='#' class ='on-default edit-row btn btn-custom btn-primary' data-toggle='modal' data-target='#custom-width-modal' onClick=\"SetInput('".$u->idMateri_gereja."','".$u->tema_kotbah."','".$u->tanggal."','".$u->pemateri."','".$u->rangkuman_materi."')\"><i class ='fa fa-pencil'></i></a>

                                             <a href ='#' class ='on-default remove-row btn btn-custom btn-danger' data-toggle='modal' data-target='#delete-modal'onClick=\"setInput1('".$u->idMateri_gereja."')\"><i class ='fa fa-trash'></i></a>
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
                        <form action="<?php echo base_url(). 'conmastermateri/add'; ?>" method="post" enctype="multipart/form-data"> 
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    
                                    <label for="field-1" class="control-label">Tema Kotbah</label>
                                    <input type="hidden" id="idMateri_gereja" name="idMateri_gereja">
                                    <input type="text" class="form-control" id="tema_kotbah" name="tema_kotbah" required>
                                </div>
                            </div>
                        </div>
                    </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Tanggal</label>
                                    <input type="text" class="form-control" id="tanggal" name="tanggal" required >
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Pemateri</label>
                                    <input type="text" class="form-control" id="pemateri" name="pemateri" required >
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="field-3" class="control-label">Rangkuman Materi</label>
                                    <input type="file" class="form-control" id="rangkuman_materi" name="rangkuman_materi" required >
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
                    <form action="<?php echo base_url().'conmastermateri/hapus';?>" method="post" class="form-horizontal" role="form">
                    <div class="modal-body">
                        <h4>Konfirmasi</h4>
                        <p>Apakah anda yakin ingin menghapus data ini ?</p>
                        <div class="form-group">
                             <input type="hidden" id="idMateri_gereja1" name="idMateri_gereja1">
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
                function SetInput(idMateri_gereja, tema_kotbah, tanggal, pemateri,rangkuman_materi) {
                    document.getElementById('idMateri_gereja').value = idMateri_gereja;
                    document.getElementById('tema_kotbah').value = tema_kotbah;
                    document.getElementById('tanggal').value = tanggal;
                    document.getElementById('pemateri').value = pemateri;
                    document.getElementById('rangkuman_materi').value = rangkuman_materi;
                }
				
                function setInput1(idMateri_gereja) {
                    document.getElementById('idMateri_gereja1').value = idMateri_gereja;
                }

                function ResetInput(idMateri_gereja, tema_kotbah,tanggal, pemateri,rangkuman_materi) {
                    document.getElementById('idMateri_gereja').value ="" ;
                    document.getElementById('tema_kotbah').value ="" ;
                    document.getElementById('tanggal').value = "" ;
                    document.getElementById('pemateri').value = "";
                    document.getElementById('rangkuman_materi').value = "";
                }
            </script>

