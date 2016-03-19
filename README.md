#### 项目介绍 ####
解决ViewPager中放Fragment，更新数据源后不刷新的问题  

> public void onClick(View v) {
>          switch (v.getId()) {
>              case R.id.btn_delete:
>                  if (!mDataList.isEmpty())
>                  mDataList.removeLast();
>                  mFragmentAdapter.updateData(mDataList);
>                  break;
>              case R.id.btn_add:
>                  mDataList.addLast(7);
>                  mFragmentAdapter.updateData(mDataList);
>                  break;
>              case R.id.btn_change:
>                  mDataList.clear();
>                  mFragmentAdapter.updateData(mDataList);
>                  break;
>              case R.id.btn_addall:
>                  mDataList.clear();
>                  for (int i = 0; i < 3; i++) {
>                      mDataList.add(7);
>                  }
>                  mFragmentAdapter.updateData(mDataList);
>                  break;
>          }
>      }