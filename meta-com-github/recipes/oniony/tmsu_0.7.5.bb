HOMEPAGE = "https://github.com/oniony/tmsu"
PV = "0.7.5"
PR = "r0"

inherit bb_fetcher
addtask do_unpack before do_build

SRCNAME = "tmsu-x86_64-${PV}"
SRC_URI = "https://github.com/oniony/tmsu/releases/download/v${PV}/${SRCNAME}.tgz;name=amd64"
SRC_URI[amd64.md5sum] = "266bb562b8831370c76a4beb341d9e10"
SRC_URI[amd64.sha256sum] = "8e648e1674b00b288a7307d962806281f97f7169a398f84b3616887c5da3e722"

S = "${WORKDIR}/${SRCNAME}/"

inherit install_bin_go
do_build(){
    install_bin_go_files \
        "${S}/bin/mount.tmsu" \
        "${S}/bin/tmsu" \
        "${S}/bin/tmsu-fs-merge" \
        "${S}/bin/tmsu-fs-mv" \
        "${S}/bin/tmsu-fs-rm"
}
